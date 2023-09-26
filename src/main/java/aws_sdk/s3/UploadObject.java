package aws_sdk.s3;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

import java.io.File;
import java.io.IOException;

public class UploadObject {

    public static void main(String[] args) throws IOException {
        String clientRegion = "ap-southeast-2";
        String bucketName = "barrabucket2";
        String stringObjKeyName = "text/myname";
        String fileObjKeyName = "files/myfile";
        String fileName = "C:\\epam\\OpenAI\\basics.txt";

        try {
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withRegion(clientRegion)
                    .withCredentials(new ProfileCredentialsProvider())
                    .build();

            // Upload a text string as a new object.

            s3Client.putObject(bucketName, stringObjKeyName, "Andrei Ruzaev - it's me!");

            // Upload a file as a new object with ContentType and title specified.

            PutObjectRequest request = new PutObjectRequest(bucketName, fileObjKeyName, new File(fileName));
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType("plain/text");
            metadata.addUserMetadata("x-amz-meta-title", "this is for user Andrei");
            request.setMetadata(metadata);
            s3Client.putObject(request);
        }
        catch(AmazonServiceException e) {
            // The call was transmitted successfully, but Amazon S3 couldn't process

            // it, so it returned an error response.

            e.printStackTrace();
        }
        catch(SdkClientException e) {
            // Amazon S3 couldn't be contacted for a response, or the client

            // couldn't parse the response from Amazon S3.

            e.printStackTrace();
        }
    }

}
