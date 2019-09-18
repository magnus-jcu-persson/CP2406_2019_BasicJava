package week8;

import java.util.Scanner;

public class TwoEventParticipants {
    public static void main(String[] args) {
        Participant[] miniMarathonParticipants = new Participant[8];
        Participant[] divingParticipants = new Participant[8];

        Scanner in = new Scanner(System.in);

        System.out.println("Mini Marathon Participants");
        for(var i = 0; i < miniMarathonParticipants.length; i++) {
            miniMarathonParticipants[i] = getParticipant(in);
        }

        System.out.println("Diving Competition Participants");
        for(var i = 0; i < miniMarathonParticipants.length; i++) {
            divingParticipants[i] = getParticipant(in);
        }

        for (Participant marathonParticipant: miniMarathonParticipants) {
            for (Participant divingParticipant: divingParticipants) {
                if (marathonParticipant.equals(divingParticipant)) {
                    System.out.println("TwoEventParticipant Found");
                    System.out.println(marathonParticipant.toString());
                }
            }
        }
    }

    private static Participant getParticipant(Scanner in) {
        System.out.print("Enter name >> ");
        String name = in.nextLine();

        System.out.print("Enter age >> ");
        Integer age = in.nextInt();

        System.out.println("Enter address >> ");
        String address = in.nextLine();

        return new Participant(name, age, address);
    }
}
