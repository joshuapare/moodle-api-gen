# # CoreTagGetTagCloudRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ctx** | **int** | Only retrieve tag instances in this context. | [optional] [default to 0]
**fromctx** | **int** | Context id where this tag cloud is displayed. | [optional] [default to 0]
**isstandard** | **bool** | Whether to return only standard tags. | [optional] [default to false]
**limit** | **int** | Maximum number of tags to retrieve. | [optional] [default to 150]
**rec** | **int** | Retrieve tag instances in the $ctx context and it&#39;s children. | [optional] [default to 1]
**search** | **string** | Search string. | [optional] [default to '']
**sort** | **string** | Sort order for display                     (id, name, rawname, count, flag, isstandard, tagcollid). | [optional] [default to 'name']
**tagcollid** | **int** | Tag collection id. | [optional] [default to 0]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
