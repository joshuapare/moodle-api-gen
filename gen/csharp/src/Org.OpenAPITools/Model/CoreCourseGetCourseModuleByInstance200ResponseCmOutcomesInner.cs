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
    /// CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner
    /// </summary>
    [DataContract(Name = "core_course_get_course_module_by_instance_200_response_cm_outcomes_inner")]
    public partial class CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner" /> class.
        /// </summary>
        /// <param name="id">Outcome id.</param>
        /// <param name="name">Outcome full name.</param>
        /// <param name="scale">Scale items.</param>
        public CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner(string id = default(string), string name = default(string), string scale = default(string))
        {
            this.Id = id;
            this.Name = name;
            this.Scale = scale;
        }

        /// <summary>
        /// Outcome id
        /// </summary>
        /// <value>Outcome id</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Outcome full name
        /// </summary>
        /// <value>Outcome full name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Scale items
        /// </summary>
        /// <value>Scale items</value>
        [DataMember(Name = "scale", EmitDefaultValue = false)]
        public string Scale { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Scale: ").Append(Scale).Append("\n");
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
