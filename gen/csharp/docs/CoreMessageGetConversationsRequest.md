# MoodleClient.Model.CoreMessageGetConversationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Favourites** | **bool** | Whether to restrict the results to contain NO favourite                 conversations (false), ONLY favourite conversation (true), or ignore any restriction altogether (null) | [optional] [default to null]
**Limitfrom** | **int** | The offset to start at | [optional] [default to 0]
**Limitnum** | **int** | Limit number of conversations to this | [optional] [default to 0]
**Mergeself** | **bool** | Whether to include self-conversations (true) or ONLY private                     conversations (false) when private conversations are requested. | [optional] [default to false]
**Type** | **int** | Filter by type | [optional] [default to null]
**Userid** | **int** | The id of the user who we are viewing conversations for | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

