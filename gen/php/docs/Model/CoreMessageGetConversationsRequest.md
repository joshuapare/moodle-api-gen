# # CoreMessageGetConversationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**favourites** | **bool** | Whether to restrict the results to contain NO favourite                 conversations (false), ONLY favourite conversation (true), or ignore any restriction altogether (null) | [optional] [default to null]
**limitfrom** | **int** | The offset to start at | [optional] [default to 0]
**limitnum** | **int** | Limit number of conversations to this | [optional] [default to 0]
**mergeself** | **bool** | Whether to include self-conversations (true) or ONLY private                     conversations (false) when private conversations are requested. | [optional] [default to false]
**type** | **int** | Filter by type | [optional] [default to null]
**userid** | **int** | The id of the user who we are viewing conversations for |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
