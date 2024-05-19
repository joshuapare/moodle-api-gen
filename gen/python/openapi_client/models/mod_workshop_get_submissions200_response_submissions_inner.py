# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from openapi_client.models.core_blog_get_entries200_response_entries_inner_summaryfiles_inner import CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner
from typing import Optional, Set
from typing_extensions import Self

class ModWorkshopGetSubmissions200ResponseSubmissionsInner(BaseModel):
    """
    ModWorkshopGetSubmissions200ResponseSubmissionsInner
    """ # noqa: E501
    attachment: Optional[StrictInt] = Field(default=0, description="Used by File API file_postupdate_standard_filemanager.")
    attachmentfiles: Optional[List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]] = None
    authorid: Optional[StrictInt] = Field(default=None, description="The author of the submission.")
    content: Optional[StrictStr] = Field(default=None, description="Submission text.")
    contentfiles: Optional[List[CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner]] = None
    contentformat: Optional[StrictInt] = Field(default=0, description="content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    contenttrust: Optional[StrictInt] = Field(default=0, description="The trust mode of the data.")
    example: Optional[StrictBool] = Field(default=False, description="Is this submission an example from teacher.")
    feedbackauthor: Optional[StrictStr] = Field(default=None, description="Teacher comment/feedback for the author of the submission, for example describing the reasons                     for the grade overriding.")
    feedbackauthorformat: Optional[StrictInt] = Field(default=0, description="feedbackauthor format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)")
    grade: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Aggregated grade for the submission. The grade is a decimal number from interval 0..100.                     If NULL then the grade for submission has not been aggregated yet.")
    gradeover: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Grade for the submission manually overridden by a teacher. Grade is always from interval 0..100.                     If NULL then the grade is not overriden.")
    gradeoverby: Optional[StrictInt] = Field(default=None, description="The id of the user who has overridden the grade for submission.")
    id: Optional[StrictInt] = Field(default=None, description="The primary key of the record.")
    late: Optional[StrictInt] = Field(default=0, description="Has this submission been submitted after the deadline or during the assessment phase?")
    published: Optional[StrictBool] = Field(default=False, description="Shall the submission be available to other when the workshop is closed.")
    timecreated: Optional[StrictInt] = Field(default=None, description="Timestamp when the work was submitted for the first time.")
    timegraded: Optional[StrictInt] = Field(default=None, description="The timestamp when grade or gradeover was recently modified.")
    timemodified: Optional[StrictInt] = Field(default=None, description="Timestamp when the submission has been updated.")
    title: Optional[StrictStr] = Field(default=None, description="The submission title.")
    workshopid: Optional[StrictInt] = Field(default=None, description="The id of the workshop instance.")
    __properties: ClassVar[List[str]] = ["attachment", "attachmentfiles", "authorid", "content", "contentfiles", "contentformat", "contenttrust", "example", "feedbackauthor", "feedbackauthorformat", "grade", "gradeover", "gradeoverby", "id", "late", "published", "timecreated", "timegraded", "timemodified", "title", "workshopid"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ModWorkshopGetSubmissions200ResponseSubmissionsInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in attachmentfiles (list)
        _items = []
        if self.attachmentfiles:
            for _item in self.attachmentfiles:
                if _item:
                    _items.append(_item.to_dict())
            _dict['attachmentfiles'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in contentfiles (list)
        _items = []
        if self.contentfiles:
            for _item in self.contentfiles:
                if _item:
                    _items.append(_item.to_dict())
            _dict['contentfiles'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ModWorkshopGetSubmissions200ResponseSubmissionsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attachment": obj.get("attachment") if obj.get("attachment") is not None else 0,
            "attachmentfiles": [CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.from_dict(_item) for _item in obj["attachmentfiles"]] if obj.get("attachmentfiles") is not None else None,
            "authorid": obj.get("authorid"),
            "content": obj.get("content"),
            "contentfiles": [CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.from_dict(_item) for _item in obj["contentfiles"]] if obj.get("contentfiles") is not None else None,
            "contentformat": obj.get("contentformat") if obj.get("contentformat") is not None else 0,
            "contenttrust": obj.get("contenttrust") if obj.get("contenttrust") is not None else 0,
            "example": obj.get("example") if obj.get("example") is not None else False,
            "feedbackauthor": obj.get("feedbackauthor"),
            "feedbackauthorformat": obj.get("feedbackauthorformat") if obj.get("feedbackauthorformat") is not None else 0,
            "grade": obj.get("grade"),
            "gradeover": obj.get("gradeover"),
            "gradeoverby": obj.get("gradeoverby"),
            "id": obj.get("id"),
            "late": obj.get("late") if obj.get("late") is not None else 0,
            "published": obj.get("published") if obj.get("published") is not None else False,
            "timecreated": obj.get("timecreated"),
            "timegraded": obj.get("timegraded"),
            "timemodified": obj.get("timemodified"),
            "title": obj.get("title"),
            "workshopid": obj.get("workshopid")
        })
        return _obj


