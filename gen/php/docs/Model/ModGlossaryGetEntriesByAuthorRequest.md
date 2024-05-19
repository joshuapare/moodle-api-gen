# # ModGlossaryGetEntriesByAuthorRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **string** | Search and order using: &#39;FIRSTNAME&#39; or &#39;LASTNAME&#39; | [optional] [default to 'LASTNAME']
**from** | **int** | Start returning records from here | [optional] [default to 0]
**id** | **int** | Glossary entry ID |
**letter** | **string** | First letter of firstname or lastname, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | [default to 'null']
**limit** | **int** | Number of records to return | [optional] [default to 20]
**options** | [**\OpenAPI\Client\Model\ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional]
**sort** | **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to 'ASC']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
