# MoodleClient.Model.MessagePopupGetPopupNotifications200ResponseNotificationsInner
message

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | The component that generated the notification | [optional] 
**Contexturl** | **string** | Context URL | [optional] 
**Contexturlname** | **string** | Context URL link name | [optional] 
**Customdata** | **string** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional] 
**Deleted** | **bool** | notification deletion status | [optional] [default to null]
**Eventtype** | **string** | The type of notification | [optional] 
**Fullmessage** | **string** | The message | [optional] 
**Fullmessageformat** | **int** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 
**Fullmessagehtml** | **string** | The message in html | [optional] 
**Iconurl** | **string** | URL for notification icon | [optional] [default to "null"]
**Id** | **int** | Notification id (this is not guaranteed to be unique                                 within this result set) | [optional] [default to null]
**Read** | **bool** | notification read status | [optional] [default to null]
**Shortenedsubject** | **string** | The notification subject shortened                                 with ellipsis | [optional] [default to "null"]
**Smallmessage** | **string** | The shorten message | [optional] 
**Subject** | **string** | The notification subject | [optional] [default to "null"]
**Text** | **string** | The message text formated | [optional] 
**Timecreated** | **int** | Time created | [optional] 
**Timecreatedpretty** | **string** | Time created in a pretty format | [optional] [default to "null"]
**Timeread** | **int** | Time read | [optional] 
**Useridfrom** | **int** | User from id | [optional] 
**Useridto** | **int** | User to id | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

