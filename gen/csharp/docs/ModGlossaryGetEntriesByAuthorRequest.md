# Org.OpenAPITools.Model.ModGlossaryGetEntriesByAuthorRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Field** | **string** | Search and order using: &#39;FIRSTNAME&#39; or &#39;LASTNAME&#39; | [optional] [default to "LASTNAME"]
**From** | **int** | Start returning records from here | [optional] [default to 0]
**Id** | **int** | Glossary entry ID | 
**Letter** | **string** | First letter of firstname or lastname, or either keywords: &#39;ALL&#39; or &#39;SPECIAL&#39;. | [default to "null"]
**Limit** | **int** | Number of records to return | [optional] [default to 20]
**Options** | [**ModGlossaryGetEntriesByAuthorRequestOptions**](ModGlossaryGetEntriesByAuthorRequestOptions.md) |  | [optional] 
**Sort** | **string** | The direction of the order: &#39;ASC&#39; or &#39;DESC&#39; | [optional] [default to "ASC"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

