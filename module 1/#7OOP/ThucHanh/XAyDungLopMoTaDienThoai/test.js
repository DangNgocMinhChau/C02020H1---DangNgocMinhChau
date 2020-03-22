class mobile {
    get battery() {
        return this._battery;
    }

    set battery(value) {
        this._battery = value;
    }

    get messageComposing() {
        return this._messageComposing;
    }

    set messageComposing(value) {
        this._messageComposing = value;
    }

    get messageInbox() {
        return this._messageInbox;
    }

    set messageInbox(value) {
        this._messageInbox = value;
    }

    get messageSend() {
        return this._messageSend;
    }

    set messageSend(value) {
        this._messageSend = value;
    }
    constructor(battery,messageComposing,messageInbox,messageSend ) {
        this.mesageComposing = messageComposing;
        this._battery = battery;
        this._messageComposing = messageComposing;
        this._messageInbox = messageInbox;
        this._messageSend = messageSend;
    }
}
    var data = ""
;    let Mobile = new mobile("100","hihii");

let battery = Mobile.battery ;
let messageComposing = Mobile.messageComposing + "<input type='text' >" ;
data = messageComposing;
document.getElementById("result").innerHTML = data;

