/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner
    /// </summary>
    [DataContract(Name = "tool_lp_data_for_course_competencies_page_200_response_competencies_inner_coursemodules_inner")]
    public partial class ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner" /> class.
        /// </summary>
        /// <param name="iconurl">iconurl.</param>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="url">url.</param>
        public ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner(string iconurl = default(string), int id = default(int), string name = default(string), string url = default(string))
        {
            this.Iconurl = iconurl;
            this.Id = id;
            this.Name = name;
            this.Url = url;
        }

        /// <summary>
        /// iconurl
        /// </summary>
        /// <value>iconurl</value>
        [DataMember(Name = "iconurl", EmitDefaultValue = false)]
        public string Iconurl { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// name
        /// </summary>
        /// <value>name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// url
        /// </summary>
        /// <value>url</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner {\n");
            sb.Append("  Iconurl: ").Append(Iconurl).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
