package com.peteraraujo.articapi.models

import com.peteraraujo.articapi.models.collections.Agent
import com.peteraraujo.articapi.models.collections.AgentRole
import com.peteraraujo.articapi.models.collections.AgentType
import com.peteraraujo.articapi.models.collections.ArtworkDateQualifier
import com.peteraraujo.articapi.models.collections.ArtworkPlaceQualifier
import com.peteraraujo.articapi.models.collections.ArtworkType
import com.peteraraujo.articapi.models.collections.CategoryTerm
import com.peteraraujo.articapi.models.collections.Exhibition
import com.peteraraujo.articapi.models.collections.Gallery
import com.peteraraujo.articapi.models.collections.Place
import com.peteraraujo.articapi.models.collections.Sound
import com.peteraraujo.articapi.models.collections.Text
import com.peteraraujo.articapi.models.collections.Video
import com.peteraraujo.articapi.models.collections.artwork.Artwork
import com.peteraraujo.articapi.models.collections.image.Image
import com.peteraraujo.articapi.models.dscatalog.Publication
import com.peteraraujo.articapi.models.dscatalog.Section
import com.peteraraujo.articapi.models.enumvaluecomparator.PropertySerialNamesAndParamEnumValuesComparator
import com.peteraraujo.articapi.models.mobile.MobileSound
import com.peteraraujo.articapi.models.mobile.Tour
import com.peteraraujo.articapi.models.shop.Product
import com.peteraraujo.articapi.models.staticarchive.Site
import com.peteraraujo.articapi.models.website.Article
import com.peteraraujo.articapi.models.website.DigitalCatalog
import com.peteraraujo.articapi.models.website.DigitalPublicationSection
import com.peteraraujo.articapi.models.website.EducatorResource
import com.peteraraujo.articapi.models.website.Event
import com.peteraraujo.articapi.models.website.EventOccurrence
import com.peteraraujo.articapi.models.website.EventProgram
import com.peteraraujo.articapi.models.website.GenericPage
import com.peteraraujo.articapi.models.website.Highlight
import com.peteraraujo.articapi.models.website.PressRelease
import com.peteraraujo.articapi.models.website.PrintedCatalog
import com.peteraraujo.articapi.models.website.StaticPage
import com.peteraraujo.articapi.services.collections.agent.AgentFieldParam
import com.peteraraujo.articapi.services.collections.agentrole.AgentRoleFieldParam
import com.peteraraujo.articapi.services.collections.agenttype.AgentTypeFieldParam
import com.peteraraujo.articapi.services.collections.artwork.ArtworkFieldParam
import com.peteraraujo.articapi.services.collections.artworkdatequalifier.ArtworkDateQualifierFieldParam
import com.peteraraujo.articapi.services.collections.artworkplacequalifier.ArtworkPlaceQualifierFieldParam
import com.peteraraujo.articapi.services.collections.artworktype.ArtworkTypeFieldParam
import com.peteraraujo.articapi.services.collections.categoryterm.CategoryTermFieldParam
import com.peteraraujo.articapi.services.collections.exhibition.ExhibitionFieldParam
import com.peteraraujo.articapi.services.collections.gallery.GalleryFieldParam
import com.peteraraujo.articapi.services.collections.image.ImageFieldParam
import com.peteraraujo.articapi.services.collections.place.PlaceFieldParam
import com.peteraraujo.articapi.services.collections.sound.SoundFieldParam
import com.peteraraujo.articapi.services.collections.text.TextFieldParam
import com.peteraraujo.articapi.services.collections.video.VideoFieldParam
import com.peteraraujo.articapi.services.dscatalog.publication.PublicationFieldParam
import com.peteraraujo.articapi.services.dscatalog.section.SectionFieldParam
import com.peteraraujo.articapi.services.mobile.mobilesound.MobileSoundFieldParam
import com.peteraraujo.articapi.services.mobile.tour.TourFieldParam
import com.peteraraujo.articapi.services.product.ProductFieldParam
import com.peteraraujo.articapi.services.site.SiteFieldParam
import com.peteraraujo.articapi.services.website.article.ArticleFieldParam
import com.peteraraujo.articapi.services.website.digitalcatalog.DigitalCatalogFieldParam
import com.peteraraujo.articapi.services.website.dssection.DigitalPublicationSectionFieldParam
import com.peteraraujo.articapi.services.website.educatorresource.EducatorResourceFieldParam
import com.peteraraujo.articapi.services.website.event.EventFieldParam
import com.peteraraujo.articapi.services.website.eventprogram.EventProgramFieldParam
import com.peteraraujo.articapi.services.website.genericpage.GenericPageFieldParam
import com.peteraraujo.articapi.services.website.highlight.HighlightFieldParam
import com.peteraraujo.articapi.services.website.pressrelease.PressReleaseFieldParam
import com.peteraraujo.articapi.services.website.printedcatalog.PrintedCatalogFieldParam
import com.peteraraujo.articapi.services.website.staticpage.StaticPageFieldParam
import data.services.articapi.services.website.eventoccurence.EventOccurrenceFieldParam
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.descriptors.capturedKClass
import kotlin.test.Test
import kotlin.test.assertTrue

class ModelsAndFieldParamTest {

    @OptIn(ExperimentalSerializationApi::class)
    @Test
    fun compareAllModelsAndFieldParams() = runTest {

        val modelsAndParams = setOf(
            // Collections
            Agent.serializer() to AgentFieldParam.entries,
            AgentRole.serializer() to AgentRoleFieldParam.entries,
            AgentType.serializer() to AgentTypeFieldParam.entries,
            Artwork.serializer() to ArtworkFieldParam.entries,
            ArtworkDateQualifier.serializer() to ArtworkDateQualifierFieldParam.entries,
            ArtworkPlaceQualifier.serializer() to ArtworkPlaceQualifierFieldParam.entries,
            ArtworkType.serializer() to ArtworkTypeFieldParam.entries,
            CategoryTerm.serializer() to CategoryTermFieldParam.entries,
            Exhibition.serializer() to ExhibitionFieldParam.entries,
            Gallery.serializer() to GalleryFieldParam.entries,
            Image.serializer() to ImageFieldParam.entries,
            Place.serializer() to PlaceFieldParam.entries,
            Sound.serializer() to SoundFieldParam.entries,
            Text.serializer() to TextFieldParam.entries,
            Video.serializer() to VideoFieldParam.entries,

            // dscatalog
            Publication.serializer() to PublicationFieldParam.entries,
            Section.serializer() to SectionFieldParam.entries,

            // Mobile
            MobileSound.serializer() to MobileSoundFieldParam.entries,
            Tour.serializer() to TourFieldParam.entries,

            // Product
            Product.serializer() to ProductFieldParam.entries,

            // Site
            Site.serializer() to SiteFieldParam.entries,

            // Website
            Article.serializer() to ArticleFieldParam.entries,
            DigitalCatalog.serializer() to DigitalCatalogFieldParam.entries,
            DigitalPublicationSection.serializer() to DigitalPublicationSectionFieldParam.entries,
            EducatorResource.serializer() to EducatorResourceFieldParam.entries,
            Event.serializer() to EventFieldParam.entries,
            EventOccurrence.serializer() to EventOccurrenceFieldParam.entries,
            EventProgram.serializer() to EventProgramFieldParam.entries,
            GenericPage.serializer() to GenericPageFieldParam.entries,
            Highlight.serializer() to HighlightFieldParam.entries,
            PressRelease.serializer() to PressReleaseFieldParam.entries,
            PrintedCatalog.serializer() to PrintedCatalogFieldParam.entries,
            StaticPage.serializer() to StaticPageFieldParam.entries,
        )

        modelsAndParams.forEach { (serializer, enums) ->

            launch {

                PropertySerialNamesAndParamEnumValuesComparator.compareParamEnumValuesPerPropertySerialNames(
                    serializedDataClass = serializer,
                    fieldParams = enums
                ).apply {
                    assertTrue(
                        actual = this.isEmpty(),
                        message = "Class of ${serializer.descriptor.serialName} - " +
                                "Value(s) present(s) as enum, but not as property serial name: " +
                                this.joinToString(separator = ", ")
                    )

                }
            }

            launch {

                PropertySerialNamesAndParamEnumValuesComparator.compareParamEnumValuesPerPropertySerialNames(
                    serializedDataClass = serializer,
                    fieldParams = enums
                ).apply {
                    assertTrue(
                        actual = this.isEmpty(),
                        message = "Class of ${serializer.descriptor.capturedKClass} - " +
                                "Value(s) present(s) as property serial name, but not as enum: " +
                                this.joinToString(separator = ", ")
                    )

                }
            }


        }

    }

}