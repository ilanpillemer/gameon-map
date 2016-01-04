package org.gameon.map;

@io.swagger.annotations.ApiModel(
        description = "An exit provides the door and URL required for the player to traverse the path "
                + "to the next room.")
public class Exit {

    /** Room id */
    @io.swagger.annotations.ApiModelProperty(
            value = "Id of the target room",
            readOnly = true, 
            example = "2",
            required = true)
    private int id;

    @io.swagger.annotations.ApiModelProperty(
            value = "Short name of the target room (small title bars)",
            example = "Barn",
            required = true)
    String name = null;
    
    /** full name */
    @io.swagger.annotations.ApiModelProperty(
            value = "Human-friendly room name",
            example = "Big Red Barn",
            required = false)
    String fullName;

    @io.swagger.annotations.ApiModelProperty(
            value = "Player-friendly door of the door provided by the target room or generated by the map",
            example = "Big red barn door",
            required = true)
    String door = null;
    
    @io.swagger.annotations.ApiModelProperty(
            value = "WebSocket URL used by the mediator to connect to the room on the player's behalf",
            example = "wss://secondroom:9008/barn/ws",
            required = true)
    String wss_url = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWss_url() {
        return wss_url;
    }

    public void setWss_url(String wss_url) {
        this.wss_url = wss_url;
    }

    @Override
    public String toString()  {
      StringBuilder sb = new StringBuilder();
      sb.append("class Exit {\n");
      sb.append("  id: ").append(id).append("\n");
      sb.append("  name: ").append(name).append("\n");
      sb.append("  fullName: ").append(fullName).append("\n");
      sb.append("  door: ").append(door).append("\n");
      sb.append("  wss_url: ").append(wss_url).append("\n");
      sb.append("}\n");
      return sb.toString();
    }
}