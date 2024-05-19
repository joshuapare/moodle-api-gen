# Org.OpenAPITools.Model.ModBigbluebuttonbnGetRecordingsToImportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Destinationinstanceid** | **int** | Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings. | [default to null]
**Groupid** | **int** | Group ID | [optional] 
**Sourcebigbluebuttonbnid** | **int** | bigbluebuttonbn instance id | [optional] [default to 0]
**Sourcecourseid** | **int** | source courseid to filter by | [optional] [default to 0]
**Tools** | **string** | a set of enabled tools | [optional] [default to "protect,unprotect,publish,unpublish,delete"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

