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
    /// CoreCourseGetCourseContentItems200ResponseContentItemsInner
    /// </summary>
    [DataContract(Name = "core_course_get_course_content_items_200_response_content_items_inner")]
    public partial class CoreCourseGetCourseContentItems200ResponseContentItemsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCourseGetCourseContentItems200ResponseContentItemsInner" /> class.
        /// </summary>
        /// <param name="archetype">The archetype of the module exposing the content item.</param>
        /// <param name="componentname">The name of the component exposing the content item.</param>
        /// <param name="favourite">Has the user favourited the content item.</param>
        /// <param name="help">Html description / help for the content item.</param>
        /// <param name="icon">Html containing the icon for the content item.</param>
        /// <param name="id">The id of the content item.</param>
        /// <param name="legacyitem">If this item was pulled from the old callback and has no item id..</param>
        /// <param name="link">The link to the content item creation page.</param>
        /// <param name="name">Name of the content item.</param>
        /// <param name="purpose">The purpose of the component exposing the content item.</param>
        /// <param name="recommended">Has this item been recommended.</param>
        /// <param name="title">The string title of the content item, human readable.</param>
        public CoreCourseGetCourseContentItems200ResponseContentItemsInner(string archetype = default(string), string componentname = default(string), bool favourite = default(bool), string help = default(string), string icon = default(string), int id = default(int), bool legacyitem = default(bool), string link = default(string), string name = default(string), string purpose = default(string), bool recommended = default(bool), string title = default(string))
        {
            this.Archetype = archetype;
            this.Componentname = componentname;
            this.Favourite = favourite;
            this.Help = help;
            this.Icon = icon;
            this.Id = id;
            this.Legacyitem = legacyitem;
            this.Link = link;
            this.Name = name;
            this.Purpose = purpose;
            this.Recommended = recommended;
            this.Title = title;
        }

        /// <summary>
        /// The archetype of the module exposing the content item
        /// </summary>
        /// <value>The archetype of the module exposing the content item</value>
        [DataMember(Name = "archetype", EmitDefaultValue = false)]
        public string Archetype { get; set; }

        /// <summary>
        /// The name of the component exposing the content item
        /// </summary>
        /// <value>The name of the component exposing the content item</value>
        [DataMember(Name = "componentname", EmitDefaultValue = false)]
        public string Componentname { get; set; }

        /// <summary>
        /// Has the user favourited the content item
        /// </summary>
        /// <value>Has the user favourited the content item</value>
        [DataMember(Name = "favourite", EmitDefaultValue = true)]
        public bool Favourite { get; set; }

        /// <summary>
        /// Html description / help for the content item
        /// </summary>
        /// <value>Html description / help for the content item</value>
        [DataMember(Name = "help", EmitDefaultValue = false)]
        public string Help { get; set; }

        /// <summary>
        /// Html containing the icon for the content item
        /// </summary>
        /// <value>Html containing the icon for the content item</value>
        [DataMember(Name = "icon", EmitDefaultValue = false)]
        public string Icon { get; set; }

        /// <summary>
        /// The id of the content item
        /// </summary>
        /// <value>The id of the content item</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// If this item was pulled from the old callback and has no item id.
        /// </summary>
        /// <value>If this item was pulled from the old callback and has no item id.</value>
        [DataMember(Name = "legacyitem", EmitDefaultValue = true)]
        public bool Legacyitem { get; set; }

        /// <summary>
        /// The link to the content item creation page
        /// </summary>
        /// <value>The link to the content item creation page</value>
        [DataMember(Name = "link", EmitDefaultValue = false)]
        public string Link { get; set; }

        /// <summary>
        /// Name of the content item
        /// </summary>
        /// <value>Name of the content item</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The purpose of the component exposing the content item
        /// </summary>
        /// <value>The purpose of the component exposing the content item</value>
        [DataMember(Name = "purpose", EmitDefaultValue = false)]
        public string Purpose { get; set; }

        /// <summary>
        /// Has this item been recommended
        /// </summary>
        /// <value>Has this item been recommended</value>
        [DataMember(Name = "recommended", EmitDefaultValue = true)]
        public bool Recommended { get; set; }

        /// <summary>
        /// The string title of the content item, human readable
        /// </summary>
        /// <value>The string title of the content item, human readable</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCourseGetCourseContentItems200ResponseContentItemsInner {\n");
            sb.Append("  Archetype: ").Append(Archetype).Append("\n");
            sb.Append("  Componentname: ").Append(Componentname).Append("\n");
            sb.Append("  Favourite: ").Append(Favourite).Append("\n");
            sb.Append("  Help: ").Append(Help).Append("\n");
            sb.Append("  Icon: ").Append(Icon).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Legacyitem: ").Append(Legacyitem).Append("\n");
            sb.Append("  Link: ").Append(Link).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Purpose: ").Append(Purpose).Append("\n");
            sb.Append("  Recommended: ").Append(Recommended).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
