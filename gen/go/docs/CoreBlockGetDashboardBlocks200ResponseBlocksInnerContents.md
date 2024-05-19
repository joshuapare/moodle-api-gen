# CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Content** | **string** | Block contents. | 
**Contentformat** | **int32** | content format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | 
**Files** | [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | 
**Footer** | **string** | Block footer. | 
**Title** | **string** | Block title. | 

## Methods

### NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerContents

`func NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerContents(content string, contentformat int32, files []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, footer string, title string, ) *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents`

NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerContents instantiates a new CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsWithDefaults

`func NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsWithDefaults() *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents`

NewCoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsWithDefaults instantiates a new CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContent

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) SetContent(v string)`

SetContent sets Content field to given value.


### GetContentformat

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetContentformat() int32`

GetContentformat returns the Contentformat field if non-nil, zero value otherwise.

### GetContentformatOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetContentformatOk() (*int32, bool)`

GetContentformatOk returns a tuple with the Contentformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentformat

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) SetContentformat(v int32)`

SetContentformat sets Contentformat field to given value.


### GetFiles

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetFiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetFilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) SetFiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetFiles sets Files field to given value.


### GetFooter

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetFooter() string`

GetFooter returns the Footer field if non-nil, zero value otherwise.

### GetFooterOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetFooterOk() (*string, bool)`

GetFooterOk returns a tuple with the Footer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFooter

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) SetFooter(v string)`

SetFooter sets Footer field to given value.


### GetTitle

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


