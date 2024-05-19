# MoodleClient.Model.CoreMessageGetMessages200ResponseMessagesInner
message

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | The component that generated the notification | [optional] [default to "null"]
**Contexturl** | **string** | Context URL | [optional] [default to "null"]
**Contexturlname** | **string** | Context URL link name | [optional] [default to "null"]
**Customdata** | **string** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional] [default to "null"]
**Eventtype** | **string** | The type of notification | [optional] [default to "null"]
**Fullmessage** | **string** | The message | [optional] [default to "null"]
**Fullmessageformat** | **int** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**Fullmessagehtml** | **string** | The message in html | [optional] [default to "null"]
**Iconurl** | **string** | URL for icon, only for notifications. | [optional] [default to "null"]
**Id** | **int** | Message id | [optional] 
**Notification** | **int** | Is a notification? | [optional] [default to null]
**Smallmessage** | **string** | The shorten message | [optional] [default to "null"]
**Subject** | **string** | The message subject | [optional] [default to "null"]
**Text** | **string** | The message text formated | [optional] [default to "null"]
**Timecreated** | **int** | Time created | [optional] 
**Timeread** | **int** | Time read | [optional] [default to null]
**Userfromfullname** | **string** | User from full name | [optional] [default to "null"]
**Useridfrom** | **int** | User from id | [optional] 
**Useridto** | **int** | User to id | [optional] 
**Usertofullname** | **string** | User to full name | [optional] [default to "null"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

