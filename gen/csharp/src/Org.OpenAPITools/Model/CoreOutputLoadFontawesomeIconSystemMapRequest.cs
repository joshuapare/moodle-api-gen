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
    /// CoreOutputLoadFontawesomeIconSystemMapRequest
    /// </summary>
    [DataContract(Name = "core_output_load_fontawesome_icon_system_map_request")]
    public partial class CoreOutputLoadFontawesomeIconSystemMapRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreOutputLoadFontawesomeIconSystemMapRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreOutputLoadFontawesomeIconSystemMapRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreOutputLoadFontawesomeIconSystemMapRequest" /> class.
        /// </summary>
        /// <param name="themename">The theme to fetch the map for (required) (default to &quot;null&quot;).</param>
        public CoreOutputLoadFontawesomeIconSystemMapRequest(string themename = @"null")
        {
            // to ensure "themename" is required (not null)
            if (themename == null)
            {
                throw new ArgumentNullException("themename is a required property for CoreOutputLoadFontawesomeIconSystemMapRequest and cannot be null");
            }
            this.Themename = themename;
        }

        /// <summary>
        /// The theme to fetch the map for
        /// </summary>
        /// <value>The theme to fetch the map for</value>
        [DataMember(Name = "themename", IsRequired = true, EmitDefaultValue = true)]
        public string Themename { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreOutputLoadFontawesomeIconSystemMapRequest {\n");
            sb.Append("  Themename: ").Append(Themename).Append("\n");
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