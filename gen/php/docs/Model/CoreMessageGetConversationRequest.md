# # CoreMessageGetConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **int** | The id of the conversation to fetch | [default to null]
**includecontactrequests** | **bool** | Include contact requests in the members | [default to null]
**includeprivacyinfo** | **bool** | Include privacy info in the members | [default to null]
**memberlimit** | **int** | Limit for number of members | [optional] [default to 0]
**memberoffset** | **int** | Offset for member list | [optional] [default to 0]
**messagelimit** | **int** | Limit for number of messages | [optional] [default to 100]
**messageoffset** | **int** | Offset for messages list | [optional] [default to 0]
**newestmessagesfirst** | **bool** | Order messages by newest first | [optional] [default to true]
**userid** | **int** | The id of the user who we are viewing conversations for | [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
