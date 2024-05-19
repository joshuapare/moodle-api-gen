# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grades_create_gradecategories_request import CoreGradesCreateGradecategoriesRequest

class TestCoreGradesCreateGradecategoriesRequest(unittest.TestCase):
    """CoreGradesCreateGradecategoriesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradesCreateGradecategoriesRequest:
        """Test CoreGradesCreateGradecategoriesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradesCreateGradecategoriesRequest`
        """
        model = CoreGradesCreateGradecategoriesRequest()
        if include_optional:
            return CoreGradesCreateGradecategoriesRequest(
                categories = [
                    openapi_client.models.core_grades_create_gradecategories_request_categories_inner.core_grades_create_gradecategories_request_categories_inner(
                        fullname = 'null', 
                        options = openapi_client.models.core_grades_create_gradecategories_request_categories_inner_options.core_grades_create_gradecategories_request_categories_inner_options(
                            aggregateonlygraded = True, 
                            aggregateoutcomes = True, 
                            aggregation = 56, 
                            aggregationcoef2 = 'null', 
                            decimals = 56, 
                            display = 56, 
                            droplow = 56, 
                            grademax = 56, 
                            grademin = 56, 
                            gradepass = 56, 
                            gradetype = 56, 
                            hiddenuntil = 56, 
                            idnumber = 'null', 
                            iteminfo = 'null', 
                            itemname = 'null', 
                            locktime = 56, 
                            parentcategoryid = 56, 
                            parentcategoryidnumber = 'null', 
                            weightoverride = True, ), )
                    ],
                courseid = 56
            )
        else:
            return CoreGradesCreateGradecategoriesRequest(
                categories = [
                    openapi_client.models.core_grades_create_gradecategories_request_categories_inner.core_grades_create_gradecategories_request_categories_inner(
                        fullname = 'null', 
                        options = openapi_client.models.core_grades_create_gradecategories_request_categories_inner_options.core_grades_create_gradecategories_request_categories_inner_options(
                            aggregateonlygraded = True, 
                            aggregateoutcomes = True, 
                            aggregation = 56, 
                            aggregationcoef2 = 'null', 
                            decimals = 56, 
                            display = 56, 
                            droplow = 56, 
                            grademax = 56, 
                            grademin = 56, 
                            gradepass = 56, 
                            gradetype = 56, 
                            hiddenuntil = 56, 
                            idnumber = 'null', 
                            iteminfo = 'null', 
                            itemname = 'null', 
                            locktime = 56, 
                            parentcategoryid = 56, 
                            parentcategoryidnumber = 'null', 
                            weightoverride = True, ), )
                    ],
                courseid = 56,
        )
        """

    def testCoreGradesCreateGradecategoriesRequest(self):
        """Test CoreGradesCreateGradecategoriesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
