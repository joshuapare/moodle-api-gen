# Org.OpenAPITools.Model.CoreNotesCreateNotesRequestNotesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Clientnoteid** | **string** | your own client id for the note. If this id is provided, the fail message id will be returned to you | [optional] [default to "null"]
**Courseid** | **int** | course id of the note (in Moodle a note can only be created into a course, even for site and personal notes) | [optional] [default to null]
**Format** | **int** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Publishstate** | **string** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; | [optional] [default to "null"]
**Text** | **string** | the text of the message - text or HTML | [optional] [default to "null"]
**Userid** | **int** | id of the user the note is about | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

