# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_lesson_get_pages200_response_pages_inner import ModLessonGetPages200ResponsePagesInner

class TestModLessonGetPages200ResponsePagesInner(unittest.TestCase):
    """ModLessonGetPages200ResponsePagesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModLessonGetPages200ResponsePagesInner:
        """Test ModLessonGetPages200ResponsePagesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModLessonGetPages200ResponsePagesInner`
        """
        model = ModLessonGetPages200ResponsePagesInner()
        if include_optional:
            return ModLessonGetPages200ResponsePagesInner(
                answerids = [
                    None
                    ],
                filescount = 56,
                filessizetotal = 56,
                jumps = [
                    None
                    ],
                page = openapi_client.models.mod_lesson_get_pages_200_response_pages_inner_page.mod_lesson_get_pages_200_response_pages_inner_page(
                    contents = '', 
                    contentsformat = 56, 
                    display = 56, 
                    displayinmenublock = True, 
                    id = 56, 
                    layout = 56, 
                    lessonid = 56, 
                    nextpageid = 56, 
                    prevpageid = 56, 
                    qoption = 56, 
                    qtype = 56, 
                    timecreated = 56, 
                    timemodified = 56, 
                    title = '', 
                    type = 56, 
                    typeid = 56, 
                    typestring = '', )
            )
        else:
            return ModLessonGetPages200ResponsePagesInner(
        )
        """

    def testModLessonGetPages200ResponsePagesInner(self):
        """Test ModLessonGetPages200ResponsePagesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
