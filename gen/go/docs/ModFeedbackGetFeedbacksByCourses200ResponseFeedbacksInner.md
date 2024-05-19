# ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Anonymous** | Pointer to **int32** | Whether the feedback is anonymous. | [optional] [default to null]
**Autonumbering** | Pointer to **bool** | Whether questions should be auto-numbered. | [optional] [default to 1]
**Completionsubmit** | Pointer to **bool** | If this field is set to 1, then the activity will be automatically marked as complete on submission. | [optional] [default to 0]
**Course** | Pointer to **int32** | Course id this feedback is part of. | [optional] [default to null]
**Coursemodule** | Pointer to **int32** | coursemodule | [optional] 
**EmailNotification** | Pointer to **bool** | Whether email notifications will be sent to teachers. | [optional] [default to null]
**Id** | Pointer to **int32** | The primary key of the record. | [optional] [default to null]
**Intro** | Pointer to **string** | Feedback introduction text. | [optional] [default to ""]
**Introfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Lang** | Pointer to **string** | Forced activity language | [optional] 
**MultipleSubmit** | Pointer to **bool** | Whether multiple submissions are allowed. | [optional] [default to 1]
**Name** | Pointer to **string** | Feedback name. | [optional] [default to "null"]
**PageAfterSubmit** | Pointer to **string** | Text to display after submission. | [optional] [default to "null"]
**PageAfterSubmitformat** | Pointer to **int32** | page_after_submit format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Pageaftersubmitfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**PublishStats** | Pointer to **bool** | Whether stats should be published. | [optional] [default to 0]
**SiteAfterSubmit** | Pointer to **string** | Link to next page after submission. | [optional] [default to "null"]
**Timeclose** | Pointer to **int32** | Allow answers until this time. | [optional] [default to null]
**Timemodified** | Pointer to **int32** | The time this record was modified. | [optional] [default to null]
**Timeopen** | Pointer to **int32** | Allow answers from this time. | [optional] [default to null]

## Methods

### NewModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner

`func NewModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner() *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner`

NewModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner instantiates a new ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInnerWithDefaults

`func NewModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInnerWithDefaults() *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner`

NewModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInnerWithDefaults instantiates a new ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAnonymous

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetAnonymous() int32`

GetAnonymous returns the Anonymous field if non-nil, zero value otherwise.

### GetAnonymousOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetAnonymousOk() (*int32, bool)`

GetAnonymousOk returns a tuple with the Anonymous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAnonymous

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetAnonymous(v int32)`

SetAnonymous sets Anonymous field to given value.

### HasAnonymous

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasAnonymous() bool`

HasAnonymous returns a boolean if a field has been set.

### GetAutonumbering

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetAutonumbering() bool`

GetAutonumbering returns the Autonumbering field if non-nil, zero value otherwise.

### GetAutonumberingOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetAutonumberingOk() (*bool, bool)`

GetAutonumberingOk returns a tuple with the Autonumbering field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutonumbering

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetAutonumbering(v bool)`

SetAutonumbering sets Autonumbering field to given value.

### HasAutonumbering

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasAutonumbering() bool`

HasAutonumbering returns a boolean if a field has been set.

### GetCompletionsubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetCompletionsubmit() bool`

GetCompletionsubmit returns the Completionsubmit field if non-nil, zero value otherwise.

### GetCompletionsubmitOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetCompletionsubmitOk() (*bool, bool)`

GetCompletionsubmitOk returns a tuple with the Completionsubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionsubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetCompletionsubmit(v bool)`

SetCompletionsubmit sets Completionsubmit field to given value.

### HasCompletionsubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasCompletionsubmit() bool`

HasCompletionsubmit returns a boolean if a field has been set.

### GetCourse

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetEmailNotification

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetEmailNotification() bool`

GetEmailNotification returns the EmailNotification field if non-nil, zero value otherwise.

### GetEmailNotificationOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetEmailNotificationOk() (*bool, bool)`

GetEmailNotificationOk returns a tuple with the EmailNotification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailNotification

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetEmailNotification(v bool)`

SetEmailNotification sets EmailNotification field to given value.

### HasEmailNotification

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasEmailNotification() bool`

HasEmailNotification returns a boolean if a field has been set.

### GetId

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetIntrofiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetIntrofilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetIntrofiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetLang

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetLang() string`

GetLang returns the Lang field if non-nil, zero value otherwise.

### GetLangOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetLangOk() (*string, bool)`

GetLangOk returns a tuple with the Lang field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLang

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetLang(v string)`

SetLang sets Lang field to given value.

### HasLang

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasLang() bool`

HasLang returns a boolean if a field has been set.

### GetMultipleSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetMultipleSubmit() bool`

GetMultipleSubmit returns the MultipleSubmit field if non-nil, zero value otherwise.

### GetMultipleSubmitOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetMultipleSubmitOk() (*bool, bool)`

GetMultipleSubmitOk returns a tuple with the MultipleSubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMultipleSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetMultipleSubmit(v bool)`

SetMultipleSubmit sets MultipleSubmit field to given value.

### HasMultipleSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasMultipleSubmit() bool`

HasMultipleSubmit returns a boolean if a field has been set.

### GetName

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPageAfterSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPageAfterSubmit() string`

GetPageAfterSubmit returns the PageAfterSubmit field if non-nil, zero value otherwise.

### GetPageAfterSubmitOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPageAfterSubmitOk() (*string, bool)`

GetPageAfterSubmitOk returns a tuple with the PageAfterSubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageAfterSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetPageAfterSubmit(v string)`

SetPageAfterSubmit sets PageAfterSubmit field to given value.

### HasPageAfterSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasPageAfterSubmit() bool`

HasPageAfterSubmit returns a boolean if a field has been set.

### GetPageAfterSubmitformat

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPageAfterSubmitformat() int32`

GetPageAfterSubmitformat returns the PageAfterSubmitformat field if non-nil, zero value otherwise.

### GetPageAfterSubmitformatOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPageAfterSubmitformatOk() (*int32, bool)`

GetPageAfterSubmitformatOk returns a tuple with the PageAfterSubmitformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageAfterSubmitformat

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetPageAfterSubmitformat(v int32)`

SetPageAfterSubmitformat sets PageAfterSubmitformat field to given value.

### HasPageAfterSubmitformat

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasPageAfterSubmitformat() bool`

HasPageAfterSubmitformat returns a boolean if a field has been set.

### GetPageaftersubmitfiles

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPageaftersubmitfiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetPageaftersubmitfiles returns the Pageaftersubmitfiles field if non-nil, zero value otherwise.

### GetPageaftersubmitfilesOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPageaftersubmitfilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetPageaftersubmitfilesOk returns a tuple with the Pageaftersubmitfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPageaftersubmitfiles

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetPageaftersubmitfiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetPageaftersubmitfiles sets Pageaftersubmitfiles field to given value.

### HasPageaftersubmitfiles

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasPageaftersubmitfiles() bool`

HasPageaftersubmitfiles returns a boolean if a field has been set.

### GetPublishStats

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPublishStats() bool`

GetPublishStats returns the PublishStats field if non-nil, zero value otherwise.

### GetPublishStatsOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetPublishStatsOk() (*bool, bool)`

GetPublishStatsOk returns a tuple with the PublishStats field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishStats

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetPublishStats(v bool)`

SetPublishStats sets PublishStats field to given value.

### HasPublishStats

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasPublishStats() bool`

HasPublishStats returns a boolean if a field has been set.

### GetSiteAfterSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetSiteAfterSubmit() string`

GetSiteAfterSubmit returns the SiteAfterSubmit field if non-nil, zero value otherwise.

### GetSiteAfterSubmitOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetSiteAfterSubmitOk() (*string, bool)`

GetSiteAfterSubmitOk returns a tuple with the SiteAfterSubmit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSiteAfterSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetSiteAfterSubmit(v string)`

SetSiteAfterSubmit sets SiteAfterSubmit field to given value.

### HasSiteAfterSubmit

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasSiteAfterSubmit() bool`

HasSiteAfterSubmit returns a boolean if a field has been set.

### GetTimeclose

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetTimeclose() int32`

GetTimeclose returns the Timeclose field if non-nil, zero value otherwise.

### GetTimecloseOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetTimecloseOk() (*int32, bool)`

GetTimecloseOk returns a tuple with the Timeclose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeclose

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetTimeclose(v int32)`

SetTimeclose sets Timeclose field to given value.

### HasTimeclose

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasTimeclose() bool`

HasTimeclose returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimeopen

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetTimeopen() int32`

GetTimeopen returns the Timeopen field if non-nil, zero value otherwise.

### GetTimeopenOk

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) GetTimeopenOk() (*int32, bool)`

GetTimeopenOk returns a tuple with the Timeopen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeopen

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) SetTimeopen(v int32)`

SetTimeopen sets Timeopen field to given value.

### HasTimeopen

`func (o *ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner) HasTimeopen() bool`

HasTimeopen returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


