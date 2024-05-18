# CoreNotesCreateNotesRequestNotesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientnoteid** | Option<**String**> | your own client id for the note. If this id is provided, the fail message id will be returned to you | [optional][default to null]
**courseid** | Option<**i32**> | course id of the note (in Moodle a note can only be created into a course, even for site and personal notes) | [optional][default to null]
**format** | Option<**i32**> | text format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN) | [optional][default to 1]
**publishstate** | Option<**String**> | 'personal', 'course' or 'site' | [optional][default to null]
**text** | Option<**String**> | the text of the message - text or HTML | [optional][default to null]
**userid** | Option<**i32**> | id of the user the note is about | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


