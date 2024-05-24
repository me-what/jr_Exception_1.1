public class Main {
    public static void main(String[] args) throws DogIsNotReadyException {
        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("\nПроверяем снаряжение! \nОшейник надет? " + dog.isCollarPutOn + "\r\nПоводок надет? "
                    + dog.isLeashPutOn + "\r\nНамордник надет? " + dog.isMuzzlePutOn);
        }
    }
}