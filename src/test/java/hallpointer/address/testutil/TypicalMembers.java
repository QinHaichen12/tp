package hallpointer.address.testutil;

import static hallpointer.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static hallpointer.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static hallpointer.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static hallpointer.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static hallpointer.address.logic.commands.CommandTestUtil.VALID_ROOM_AMY;
import static hallpointer.address.logic.commands.CommandTestUtil.VALID_ROOM_BOB;
import static hallpointer.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static hallpointer.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hallpointer.address.model.AddressBook;
import hallpointer.address.model.member.Member;

/**
 * A utility class containing a list of {@code Member} objects to be used in tests.
 */
public class TypicalMembers {

    public static final Member ALICE = new MemberBuilder().withName("Alice Pauline")
            .withRoom("123, Jurong West Ave 6, #08-111")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Member BENSON = new MemberBuilder().withName("Benson Meier")
            .withRoom("311, Clementi Ave 2, #02-25")
            .withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Member CARL = new MemberBuilder().withName("Carl Kurz").withPhone("95352563")
            .withRoom("wall street").build();
    public static final Member DANIEL = new MemberBuilder().withName("Daniel Meier").withPhone("87652533")
            .withRoom("10th street").withTags("friends").build();
    public static final Member ELLE = new MemberBuilder().withName("Elle Meyer").withPhone("9482224")
            .withRoom("michegan ave").build();
    public static final Member FIONA = new MemberBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withRoom("little tokyo").build();
    public static final Member GEORGE = new MemberBuilder().withName("George Best").withPhone("9482442")
            .withRoom("4th street").build();

    // Manually added
    public static final Member HOON = new MemberBuilder().withName("Hoon Meier").withPhone("8482424")
            .withRoom("little india").build();
    public static final Member IDA = new MemberBuilder().withName("Ida Mueller").withPhone("8482131")
            .withRoom("chicago ave").build();

    // Manually added - Member's details found in {@code CommandTestUtil}
    public static final Member AMY = new MemberBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withRoom(VALID_ROOM_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Member BOB = new MemberBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withRoom(VALID_ROOM_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalMembers() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical members.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Member member : getTypicalMembers()) {
            ab.addMember(member);
        }
        return ab;
    }

    public static List<Member> getTypicalMembers() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
