package data;

import java.util.List;

public interface RiverDAO {
  public River getRiverByName(String name);
  public River getRiverByCounty(String county);
  public List<River> getRiverByStreamType(String StreamType);
  public void addRiver(River river);
}
