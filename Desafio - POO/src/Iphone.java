
class Iphone {


    public static void main(String[] args) {
        TelephoneDevice telephoneDevice = new TelephoneDevice();
        Player player = new Player();
        Browser browser = new Browser();
        String number = "19 99999-9999";
        telephoneDevice.attend();
        telephoneDevice.call(number);
        telephoneDevice.startVoiceMail();
        String url = "www.google.com";
        browser.showPage(url);
        browser.refreshPage();
        browser.addNewTab();
        String music = "Happy";
        player.selectMusic(music);
        player.play();
        player.pause();
    }
}
