# ModBigbluebuttonbnGetRecordingsToImportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationinstanceid** | **i32** | Id of the other BBB we target for importing recordings into.                 The idea here is to remove already imported recordings. | [default to null]
**groupid** | Option<**i32**> | Group ID | [optional]
**sourcebigbluebuttonbnid** | Option<**i32**> | bigbluebuttonbn instance id | [optional][default to 0]
**sourcecourseid** | Option<**i32**> | source courseid to filter by | [optional][default to 0]
**tools** | Option<**String**> | a set of enabled tools | [optional][default to protect,unprotect,publish,unpublish,delete]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


