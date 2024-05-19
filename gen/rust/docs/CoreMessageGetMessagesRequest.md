# CoreMessageGetMessagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limitfrom** | Option<**i32**> | limit from | [optional][default to 0]
**limitnum** | Option<**i32**> | limit number | [optional][default to 0]
**newestfirst** | Option<**bool**> | true for ordering by newest first, false for oldest first | [optional][default to true]
**read** | Option<**i32**> | 1 for getting read messages, 0 for unread, 2 for both | [optional][default to 1]
**r#type** | Option<**String**> | type of message to return, expected values are: notifications, conversations and both | [optional][default to both]
**useridfrom** | Option<**i32**> | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional][default to 0]
**useridto** | **i32** | the user id who received the message, 0 for any user | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


