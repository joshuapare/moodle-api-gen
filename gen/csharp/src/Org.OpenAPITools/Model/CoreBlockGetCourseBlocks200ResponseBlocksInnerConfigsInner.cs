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
    /// CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner
    /// </summary>
    [DataContract(Name = "core_block_get_course_blocks_200_response_blocks_inner_configs_inner")]
    public partial class CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner" /> class.
        /// </summary>
        /// <param name="name">Name. (default to &quot;null&quot;).</param>
        /// <param name="type">Type (instance or plugin). (default to &quot;null&quot;).</param>
        /// <param name="value">JSON encoded representation of the config value. (default to &quot;null&quot;).</param>
        public CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner(string name = @"null", string type = @"null", string value = @"null")
        {
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            // use default value if no "type" provided
            this.Type = type ?? @"null";
            // use default value if no "value" provided
            this.Value = value ?? @"null";
        }

        /// <summary>
        /// Name.
        /// </summary>
        /// <value>Name.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Type (instance or plugin).
        /// </summary>
        /// <value>Type (instance or plugin).</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// JSON encoded representation of the config value.
        /// </summary>
        /// <value>JSON encoded representation of the config value.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
