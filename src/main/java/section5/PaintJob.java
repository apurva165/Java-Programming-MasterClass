package section5;

public class PaintJob {
    public static void main(String[] args) {
        getBucketCount(2.75, 3.25, 2.5, 1);
        getBucketCount(3.4, 2.1, 1.5, 2);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
            return -1;
        }

        double area = width * height;
        int numOfBucketsNeeded = (int) (area/areaPerBucket);

        System.out.println(numOfBucketsNeeded);
        return numOfBucketsNeeded;

    }
}
