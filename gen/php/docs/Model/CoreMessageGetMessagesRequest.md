# # CoreMessageGetMessagesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limitfrom** | **int** | limit from | [optional] [default to 0]
**limitnum** | **int** | limit number | [optional] [default to 0]
**newestfirst** | **bool** | true for ordering by newest first, false for oldest first | [optional] [default to true]
**read** | **int** | 1 for getting read messages, 0 for unread, 2 for both | [optional] [default to 1]
**type** | **string** | type of message to return, expected values are: notifications, conversations and both | [optional] [default to 'both']
**useridfrom** | **int** | the user id who send the message, 0 for any user. -10 or -20 for no-reply or support user | [optional] [default to 0]
**useridto** | **int** | the user id who received the message, 0 for any user | [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
