# CoreMessageGetConversationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**favourites** | Option<**bool**> | Whether to restrict the results to contain NO favourite                 conversations (false), ONLY favourite conversation (true), or ignore any restriction altogether (null) | [optional][default to null]
**limitfrom** | Option<**i32**> | The offset to start at | [optional][default to 0]
**limitnum** | Option<**i32**> | Limit number of conversations to this | [optional][default to 0]
**mergeself** | Option<**bool**> | Whether to include self-conversations (true) or ONLY private                     conversations (false) when private conversations are requested. | [optional][default to false]
**r#type** | Option<**i32**> | Filter by type | [optional][default to null]
**userid** | **i32** | The id of the user who we are viewing conversations for | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


