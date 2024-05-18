# # ModBigbluebuttonbnGetRecordingsToImportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationinstanceid** | **int** | Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings. | [default to null]
**groupid** | **int** | Group ID | [optional]
**sourcebigbluebuttonbnid** | **int** | bigbluebuttonbn instance id | [optional] [default to 0]
**sourcecourseid** | **int** | source courseid to filter by | [optional] [default to 0]
**tools** | **string** | a set of enabled tools | [optional] [default to 'protect,unprotect,publish,unpublish,delete']

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
