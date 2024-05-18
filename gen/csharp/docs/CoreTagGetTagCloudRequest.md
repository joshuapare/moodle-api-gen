# Org.OpenAPITools.Model.CoreTagGetTagCloudRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ctx** | **int** | Only retrieve tag instances in this context. | [optional] [default to 0]
**Fromctx** | **int** | Context id where this tag cloud is displayed. | [optional] [default to 0]
**Isstandard** | **bool** | Whether to return only standard tags. | [optional] [default to false]
**Limit** | **int** | Maximum number of tags to retrieve. | [optional] [default to 150]
**Rec** | **int** | Retrieve tag instances in the $ctx context and it&#39;s children. | [optional] [default to 1]
**Search** | **string** | Search string. | [optional] [default to ""]
**Sort** | **string** | Sort order for display                     (id, name, rawname, count, flag, isstandard, tagcollid). | [optional] [default to "name"]
**Tagcollid** | **int** | Tag collection id. | [optional] [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

