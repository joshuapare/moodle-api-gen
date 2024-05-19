# CoreMessageGetMessages200ResponseMessagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | Option<**String**> | The component that generated the notification | [optional][default to null]
**contexturl** | Option<**String**> | Context URL | [optional][default to null]
**contexturlname** | Option<**String**> | Context URL link name | [optional][default to null]
**customdata** | Option<**String**> | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional][default to null]
**eventtype** | Option<**String**> | The type of notification | [optional][default to null]
**fullmessage** | Option<**String**> | The message | [optional][default to null]
**fullmessageformat** | Option<**i32**> | fullmessage format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to null]
**fullmessagehtml** | Option<**String**> | The message in html | [optional][default to null]
**iconurl** | Option<**String**> | URL for icon, only for notifications. | [optional][default to null]
**id** | Option<**i32**> | Message id | [optional]
**notification** | Option<**i32**> | Is a notification? | [optional][default to null]
**smallmessage** | Option<**String**> | The shorten message | [optional][default to null]
**subject** | Option<**String**> | The message subject | [optional][default to null]
**text** | Option<**String**> | The message text formated | [optional][default to null]
**timecreated** | Option<**i32**> | Time created | [optional]
**timeread** | Option<**i32**> | Time read | [optional][default to null]
**userfromfullname** | Option<**String**> | User from full name | [optional][default to null]
**useridfrom** | Option<**i32**> | User from id | [optional]
**useridto** | Option<**i32**> | User to id | [optional]
**usertofullname** | Option<**String**> | User to full name | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


