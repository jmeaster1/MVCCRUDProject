package data;

public interface RiverDAO {
  public River getRiverByName(String name);
  public River getRiverByCounty(String county);
  public River getRiverByStreamType(String StreamType);
  public void addRiver(River river);
}
