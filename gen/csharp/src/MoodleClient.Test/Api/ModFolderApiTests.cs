/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using MoodleClient.Client;
using MoodleClient.Api;
// uncomment below to import models
//using MoodleClient.Model;

namespace MoodleClient.Test.Api
{
    /// <summary>
    ///  Class for testing ModFolderApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ModFolderApiTests : IDisposable
    {
        private ModFolderApi instance;

        public ModFolderApiTests()
        {
            instance = new ModFolderApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ModFolderApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ModFolderApi
            //Assert.IsType<ModFolderApi>(instance);
        }

        /// <summary>
        /// Test ModFolderGetFoldersByCourses
        /// </summary>
        [Fact]
        public void ModFolderGetFoldersByCoursesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = null;
            //var response = instance.ModFolderGetFoldersByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
            //Assert.IsType<ModFolderGetFoldersByCourses200Response>(response);
        }

        /// <summary>
        /// Test ModFolderViewFolder
        /// </summary>
        [Fact]
        public void ModFolderViewFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModFolderViewFolderRequest modFolderViewFolderRequest = null;
            //var response = instance.ModFolderViewFolder(modFolderViewFolderRequest);
            //Assert.IsType<CoreCalendarDeleteSubscription200Response>(response);
        }
    }
}