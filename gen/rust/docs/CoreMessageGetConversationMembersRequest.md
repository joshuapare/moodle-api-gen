# CoreMessageGetConversationMembersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationid** | **i32** | The id of the conversation | 
**includecontactrequests** | Option<**bool**> | Do we want to include contact requests? | [optional][default to false]
**includeprivacyinfo** | Option<**bool**> | Do we want to include privacy info? | [optional][default to false]
**limitfrom** | Option<**i32**> | Limit from | [optional][default to 0]
**limitnum** | Option<**i32**> | Limit number | [optional][default to 0]
**userid** | **i32** | The id of the user we are performing this action on behalf of | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


