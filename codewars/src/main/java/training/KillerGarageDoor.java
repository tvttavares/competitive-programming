package training;

public class KillerGarageDoor {

    public static String door(String events) {
        StringBuilder sb = new StringBuilder();

        int floorCount = 0;
        boolean halt = false;
        boolean buttonPressed = false;
        boolean bottomToUp = true;

        for (char e : events.toCharArray()) {
            switch (e) {
                case ('.'):
                    if (halt || !buttonPressed) {
                        sb.append(floorCount);
                    } else {
                        if (floorCount == 5 || floorCount == 0) {
                            sb.append(floorCount);
                        } else {
                            if (bottomToUp) {
                                sb.append(++floorCount);
                            } else {
                                sb.append(--floorCount);
                            }
                        }
                    }
                    break;

                case ('P'):
                    if (floorCount == 5 || floorCount == 0) {
                        buttonPressed = false;
                    }

                    if (halt) {
                        halt = false;
                        buttonPressed = false;
                    }

                    if (buttonPressed) {
                        halt = true;
                    }

                    if (halt) {
                        sb.append(floorCount);
                    } else {
                        if (bottomToUp) {
                            if (floorCount == 5) {
                                bottomToUp = false;
                                sb.append(--floorCount);
                            } else {
                                sb.append(++floorCount);
                            }
                        } else {
                            if (floorCount == 0) {
                                bottomToUp = true;
                                sb.append(++floorCount);
                            } else {
                                sb.append(--floorCount);
                            }
                        }
                    }
                    buttonPressed = true;
                    break;

                case ('O'):
                    if (halt || !buttonPressed) {
                        sb.append(floorCount);
                        continue;
                    }

                    if (bottomToUp) {
                        bottomToUp = false;
                        sb.append(--floorCount);
                    } else {
                        bottomToUp = true;
                        sb.append(++floorCount);
                    }
                    break;
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(".......... - " + door("..........")); // 0000000000
        System.out.println("P.. - " + door("P..")); // 123
        System.out.println("P...... - " + door("P......")); // 12345
        System.out.println("P.P.. - " + door("P.P..")); // 12222
        System.out.println("P.....P.. - " + door("P.....P..")); // 123455432
        System.out.println("P.O.... - " + door("P.O....")); // 1210000
        System.out.println("..P...O..... - " + door("..P...O.....")); // 001234321000
        System.out.println("P.P..P.P.P.... - " + door("P.P..P.P.P....")); // 122234555
    }
}
