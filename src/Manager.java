import java.util.ArrayList;
import java.util.List;

public class Manager {

	List<Member> Members = new ArrayList<Member>();
	List<Room> rooms = new ArrayList<Room>();

	public void addMem(Member m) {
		Members.add(m);

	}

	public Member getMem(String ID) {
		for (int i = 0; i < Members.size(); i++) {
			if (Members.get(i).getName() == ID)
				return Members.get(i);

		}

		return null;

	}

	public void addRoom(List<Member> Mems) {

		Room room = new Room();
		room.setMembers(Mems);

	}

	public void RoomOut(int room_num, Member m) {
		
		for (int i = 0; i < rooms.size(); i++) {
			if (rooms.get(i).getRoom_num() == room_num){
				rooms.get(i).getMembers().remove(m);
				 if(rooms.size()==0)
					 rooms.remove(i);
			    break;	
			}

		}

		
	}

}
