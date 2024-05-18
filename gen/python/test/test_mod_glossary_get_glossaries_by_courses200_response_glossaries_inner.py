# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_glossary_get_glossaries_by_courses200_response_glossaries_inner import ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner

class TestModGlossaryGetGlossariesByCourses200ResponseGlossariesInner(unittest.TestCase):
    """ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner:
        """Test ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner`
        """
        model = ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner()
        if include_optional:
            return ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner(
                allowcomments = 56,
                allowduplicatedentries = 56,
                allowprintview = 56,
                approvaldisplayformat = 'null',
                assessed = 56,
                assesstimefinish = 56,
                assesstimestart = 56,
                browsemodes = [
                    None
                    ],
                canaddentry = 56,
                completionentries = 56,
                course = 56,
                coursemodule = 56,
                defaultapproval = 56,
                displayformat = 'null',
                editalways = 56,
                entbypage = 56,
                globalglossary = 56,
                groupingid = 56,
                groupmode = 56,
                id = 56,
                intro = '',
                introfiles = [
                    openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                        filename = '', 
                        filepath = '', 
                        filesize = 56, 
                        fileurl = '', 
                        isexternalfile = True, 
                        mimetype = '', 
                        repositorytype = '', 
                        timemodified = 56, )
                    ],
                introformat = 56,
                lang = '',
                mainglossary = 56,
                name = '',
                rssarticles = 56,
                rsstype = 56,
                scale = 56,
                section = 56,
                showall = 56,
                showalphabet = 56,
                showspecial = 56,
                timecreated = 56,
                timemodified = 56,
                usedynalink = 56,
                visible = True
            )
        else:
            return ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner(
        )
        """

    def testModGlossaryGetGlossariesByCourses200ResponseGlossariesInner(self):
        """Test ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()