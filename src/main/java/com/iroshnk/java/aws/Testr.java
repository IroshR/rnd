package com.iroshnk.java.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.TransferManager;

import java.io.File;

/**
 * Created by HP on 1/10/2018.
 */
public class Testr {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\HP\\Desktop\\new");
        AWSCredentials credentials = new BasicAWSCredentials(
                "AKIAJJKAUA3MIXIPP4AQ",
                "NCd32nGG6bZvh6b42qTXFU1ppA3x2ng9pmEPjm+a");

        AmazonS3 s3client = new AmazonS3Client(credentials);

        /*s3client.setRegion(Region.AP_Singapore.toAWSRegion());

        s3client.putObject(new PutObjectRequest("bitcointst", file.getName(), file)
                .withCannedAcl(CannedAccessControlList.PublicRead));*/


        TransferManager tx = new TransferManager(credentials);
        MultipleFileUpload myUpload = tx.uploadDirectory("bitcointst", "", file,true);
        if (myUpload.isDone() == false) {
            System.out.println("Transfer: " + myUpload.getDescription());
            System.out.println("  - State: " + myUpload.getState());
            System.out.println("  - Progress: "
                    + myUpload.getProgress().getBytesTransferred());
        }
        myUpload.waitForCompletion();

        System.out.println("end");

    }
}
