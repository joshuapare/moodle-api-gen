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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreCourseGetCourseModuleByInstanceRequest
    /// </summary>
    [DataContract(Name = "core_course_get_course_module_by_instance_request")]
    public partial class CoreCourseGetCourseModuleByInstanceRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetCourseModuleByInstanceRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCourseGetCourseModuleByInstanceRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetCourseModuleByInstanceRequest" /> class.
        /// </summary>
        /// <param name="instance">The module instance id (required) (default to null).</param>
        /// <param name="module">The module name (required) (default to &quot;null&quot;).</param>
        public CoreCourseGetCourseModuleByInstanceRequest(int instance = null, string module = @"null")
        {
            this.Instance = instance;
            // to ensure "module" is required (not null)
            if (module == null)
            {
                throw new ArgumentNullException("module is a required property for CoreCourseGetCourseModuleByInstanceRequest and cannot be null");
            }
            this.Module = module;
        }

        /// <summary>
        /// The module instance id
        /// </summary>
        /// <value>The module instance id</value>
        [DataMember(Name = "instance", IsRequired = true, EmitDefaultValue = true)]
        public int Instance { get; set; }

        /// <summary>
        /// The module name
        /// </summary>
        /// <value>The module name</value>
        [DataMember(Name = "module", IsRequired = true, EmitDefaultValue = true)]
        public string Module { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetCourseModuleByInstanceRequest {\n");
            sb.Append("  Instance: ").Append(Instance).Append("\n");
            sb.Append("  Module: ").Append(Module).Append("\n");
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
