# MessagePopupGetPopupNotifications200ResponseNotificationsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | Option<**String**> | The component that generated the notification | [optional]
**contexturl** | Option<**String**> | Context URL | [optional]
**contexturlname** | Option<**String**> | Context URL link name | [optional]
**customdata** | Option<**String**> | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional]
**deleted** | Option<**bool**> | notification deletion status | [optional][default to null]
**eventtype** | Option<**String**> | The type of notification | [optional]
**fullmessage** | Option<**String**> | The message | [optional]
**fullmessageformat** | Option<**i32**> | fullmessage format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional]
**fullmessagehtml** | Option<**String**> | The message in html | [optional]
**iconurl** | Option<**String**> | URL for notification icon | [optional][default to null]
**id** | Option<**i32**> | Notification id (this is not guaranteed to be unique                                 within this result set) | [optional][default to null]
**read** | Option<**bool**> | notification read status | [optional][default to null]
**shortenedsubject** | Option<**String**> | The notification subject shortened                                 with ellipsis | [optional][default to null]
**smallmessage** | Option<**String**> | The shorten message | [optional]
**subject** | Option<**String**> | The notification subject | [optional][default to null]
**text** | Option<**String**> | The message text formated | [optional]
**timecreated** | Option<**i32**> | Time created | [optional]
**timecreatedpretty** | Option<**String**> | Time created in a pretty format | [optional][default to null]
**timeread** | Option<**i32**> | Time read | [optional]
**useridfrom** | Option<**i32**> | User from id | [optional]
**useridto** | Option<**i32**> | User to id | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


