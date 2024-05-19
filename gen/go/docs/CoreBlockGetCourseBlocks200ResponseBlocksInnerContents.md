# CoreBlockGetCourseBlocks200ResponseBlocksInnerContents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | Block contents. | [default to "null"]
**Contentformat** | **int32** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [default to null]
**Files** | [**[]CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**Footer** | **string** | Block footer. | [default to "null"]
**Title** | **string** | Block title. | [default to "null"]

## Methods

### NewCoreBlockGetCourseBlocks200ResponseBlocksInnerContents

`func NewCoreBlockGetCourseBlocks200ResponseBlocksInnerContents(content string, contentformat int32, files []CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner, footer string, title string, ) *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents`

NewCoreBlockGetCourseBlocks200ResponseBlocksInnerContents instantiates a new CoreBlockGetCourseBlocks200ResponseBlocksInnerContents object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetCourseBlocks200ResponseBlocksInnerContentsWithDefaults

`func NewCoreBlockGetCourseBlocks200ResponseBlocksInnerContentsWithDefaults() *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents`

NewCoreBlockGetCourseBlocks200ResponseBlocksInnerContentsWithDefaults instantiates a new CoreBlockGetCourseBlocks200ResponseBlocksInnerContents object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) SetContent(v string)`

SetContent sets Content field to given value.


### GetContentformat

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.


### GetFiles

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetFiles() []CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetFilesOk() (*[]CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) SetFiles(v []CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner)`

SetFiles sets Files field to given value.


### GetFooter

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetFooter() string`

GetFooter returns the Footer field if non-nil, zero value otherwise.

### GetFooterOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetFooterOk() (*string, bool)`

GetFooterOk returns a tuple with the Footer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFooter

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) SetFooter(v string)`

SetFooter sets Footer field to given value.


### GetTitle

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreBlockGetCourseBlocks200ResponseBlocksInnerContents) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


