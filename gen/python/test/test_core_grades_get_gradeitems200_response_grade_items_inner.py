# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grades_get_gradeitems200_response_grade_items_inner import CoreGradesGetGradeitems200ResponseGradeItemsInner

class TestCoreGradesGetGradeitems200ResponseGradeItemsInner(unittest.TestCase):
    """CoreGradesGetGradeitems200ResponseGradeItemsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradesGetGradeitems200ResponseGradeItemsInner:
        """Test CoreGradesGetGradeitems200ResponseGradeItemsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradesGetGradeitems200ResponseGradeItemsInner`
        """
        model = CoreGradesGetGradeitems200ResponseGradeItemsInner()
        if include_optional:
            return CoreGradesGetGradeitems200ResponseGradeItemsInner(
                category = 'null',
                id = 'null',
                itemname = 'null'
            )
        else:
            return CoreGradesGetGradeitems200ResponseGradeItemsInner(
        )
        """

    def testCoreGradesGetGradeitems200ResponseGradeItemsInner(self):
        """Test CoreGradesGetGradeitems200ResponseGradeItemsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
