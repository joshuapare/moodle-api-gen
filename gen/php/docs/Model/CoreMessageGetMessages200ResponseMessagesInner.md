# # CoreMessageGetMessages200ResponseMessagesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **string** | The component that generated the notification | [optional] [default to 'null']
**contexturl** | **string** | Context URL | [optional] [default to 'null']
**contexturlname** | **string** | Context URL link name | [optional] [default to 'null']
**customdata** | **string** | Custom data to be passed to the message processor.                                 The data here is serialised using json_encode(). | [optional] [default to 'null']
**eventtype** | **string** | The type of notification | [optional] [default to 'null']
**fullmessage** | **string** | The message | [optional] [default to 'null']
**fullmessageformat** | **int** | fullmessage format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to null]
**fullmessagehtml** | **string** | The message in html | [optional] [default to 'null']
**iconurl** | **string** | URL for icon, only for notifications. | [optional] [default to 'null']
**id** | **int** | Message id | [optional]
**notification** | **int** | Is a notification? | [optional] [default to null]
**smallmessage** | **string** | The shorten message | [optional] [default to 'null']
**subject** | **string** | The message subject | [optional] [default to 'null']
**text** | **string** | The message text formated | [optional] [default to 'null']
**timecreated** | **int** | Time created | [optional]
**timeread** | **int** | Time read | [optional] [default to null]
**userfromfullname** | **string** | User from full name | [optional] [default to 'null']
**useridfrom** | **int** | User from id | [optional]
**useridto** | **int** | User to id | [optional]
**usertofullname** | **string** | User to full name | [optional] [default to 'null']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
