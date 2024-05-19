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
    /// CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner
    /// </summary>
    [DataContract(Name = "core_course_get_courses_by_field_200_response_courses_inner_customfields_inner")]
    public partial class CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner" /> class.
        /// </summary>
        /// <param name="name">The name of the custom field.</param>
        /// <param name="shortname">The shortname of the custom field - to be able to build the field class in the code.</param>
        /// <param name="type">The type of the custom field - text field, checkbox....</param>
        /// <param name="value">The value of the custom field.</param>
        /// <param name="valueraw">The raw value of the custom field.</param>
        public CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner(string name = default(string), string shortname = default(string), string type = default(string), string value = default(string), string valueraw = default(string))
        {
            this.Name = name;
            this.Shortname = shortname;
            this.Type = type;
            this.Value = value;
            this.Valueraw = valueraw;
        }

        /// <summary>
        /// The name of the custom field
        /// </summary>
        /// <value>The name of the custom field</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The shortname of the custom field - to be able to build the field class in the code
        /// </summary>
        /// <value>The shortname of the custom field - to be able to build the field class in the code</value>
        [DataMember(Name = "shortname", EmitDefaultValue = false)]
        public string Shortname { get; set; }

        /// <summary>
        /// The type of the custom field - text field, checkbox...
        /// </summary>
        /// <value>The type of the custom field - text field, checkbox...</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// The value of the custom field
        /// </summary>
        /// <value>The value of the custom field</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// The raw value of the custom field
        /// </summary>
        /// <value>The raw value of the custom field</value>
        [DataMember(Name = "valueraw", EmitDefaultValue = false)]
        public string Valueraw { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Shortname: ").Append(Shortname).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Valueraw: ").Append(Valueraw).Append("\n");
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
