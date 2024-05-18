# CoreMessageGetConversationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **i32** | The id of the conversation to fetch | [default to null]
**includecontactrequests** | **bool** | Include contact requests in the members | [default to null]
**includeprivacyinfo** | **bool** | Include privacy info in the members | [default to null]
**memberlimit** | Option<**i32**> | Limit for number of members | [optional][default to 0]
**memberoffset** | Option<**i32**> | Offset for member list | [optional][default to 0]
**messagelimit** | Option<**i32**> | Limit for number of messages | [optional][default to 100]
**messageoffset** | Option<**i32**> | Offset for messages list | [optional][default to 0]
**newestmessagesfirst** | Option<**bool**> | Order messages by newest first | [optional][default to true]
**userid** | **i32** | The id of the user who we are viewing conversations for | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


