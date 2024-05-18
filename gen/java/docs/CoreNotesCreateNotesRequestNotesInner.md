

# CoreNotesCreateNotesRequestNotesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientnoteid** | **String** | your own client id for the note. If this id is provided, the fail message id will be returned to you |  [optional] |
|**courseid** | **Integer** | course id of the note (in Moodle a note can only be created into a course, even for site and personal notes) |  [optional] |
|**format** | **Integer** | text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**publishstate** | **String** | &#39;personal&#39;, &#39;course&#39; or &#39;site&#39; |  [optional] |
|**text** | **String** | the text of the message - text or HTML |  [optional] |
|**userid** | **Integer** | id of the user the note is about |  [optional] |



