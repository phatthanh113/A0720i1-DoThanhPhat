package model.entity;

public class Room extends Service implements IAttachService {
    public Room() {
    }

    public Room(String name, String area, String cost, String maxPeople, String rentType, String rentTypeId) {
        super(name, area, cost, maxPeople, rentType, rentTypeId);
    }

    @Override
    public String getAttachServiceName() {
        return null;
    }

    @Override
    public String getAttachServiceUnit() {
        return null;
    }

    @Override
    public String getAttachServiceCost() {
        return null;
    }
}
