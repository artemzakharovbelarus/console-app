package by.javatr.library.console;

/**
 *Class that have a response;
 *<b>response</b>
 *@author Zakharov Artem
 *@version 1.0
 */
public class ConsoleResponse {
    /**field response*/
    private String response;

    /**
     * Constructor - makes an object
     * @param response text that will be a response for some request method
     */
    public ConsoleResponse(String response) {
        setResponse(response);
    }

    /**
     * method of getting the text of response (as toString();)
     * @return text of response
     */
    public String getResponse() {
        return response;
    }

    /**
     * Method of setting text response
     * @param response text of response
     */
    public void setResponse(String response) {
        this.response = response;
    }
}
